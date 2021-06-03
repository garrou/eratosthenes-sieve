package _1irdA.eratosthene.models;

import static _1irdA.eratosthene.utils.SieveUtils.filter;

/**
 * Task class to find prime numbers concurrently
 */
public class RunnableTask implements Runnable {

    /**
     * Multiple to set at false
     */
    private final int position;

    /**
     * Array who define if an number is a primer number
     * The prime number is represented with the index
     */
    private final boolean[] primes;

    /**
     * Initialize Task
     * @param primesArr array who define if a number is a primer number
     * @param multiple multiple to set at false
     */
    public RunnableTask(boolean[] primesArr, int multiple) {
        primes = primesArr;
        position = multiple;
    }

    @Override
    public void run() {
        filter(primes, position);
    }
}