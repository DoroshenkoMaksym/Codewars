package com.doroshenko;

import java.math.BigInteger;

/**
 * Created by maksym on 1/23/16.
 */
public class PileCubes {

    public static void main(String[] args) {
        PileCubes pileCubes = new PileCubes();
        System.out.println(pileCubes.findNb(1071225));
        System.out.println(pileCubes.findNb(2023348221870469209L));

    }

    public long findNb(long m) {
        if (m == 0) {
            return 0;
        }
        return pileCubes(BigInteger.valueOf(m), BigInteger.ONE);
    }

    private static long pileCubes(BigInteger blocks, BigInteger cubes) {
        while (!blocks.equals(BigInteger.ZERO)) {
            if (blocks.compareTo(BigInteger.ZERO) == -1) {
                return -1;
            } else {
                blocks = blocks.subtract(cubes.pow(3));
                cubes = cubes.add(BigInteger.ONE);
            }
        }
        return cubes.longValue()-1;
    }

    private static long recursivePileCubesWithBigInt(BigInteger blocks, BigInteger cubes) {
        if (blocks.equals(BigInteger.ZERO)) {
            return cubes.longValue() - 1;
        } else if (blocks.compareTo(BigInteger.ZERO) == -1) {
            return -1;
        } else {
            return recursivePileCubesWithBigInt(blocks.subtract(cubes.pow(3)), cubes.add(BigInteger.ONE));
        }
    }


    private long recursivePileCubes(long blocks, long cubes) {
        System.out.println(cubes);
        if (blocks == 0) {
            return cubes - 1;
        } else if (blocks < 0) {
            return -1;
        } else {
            return recursivePileCubes(blocks - (long) Math.pow(cubes, 3), cubes + 1);
        }
    }
}
