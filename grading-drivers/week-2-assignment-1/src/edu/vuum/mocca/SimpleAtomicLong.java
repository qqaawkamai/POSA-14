// Import the necessary Java synchronization and scheduling classes.

package edu.vuum.mocca;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.Lock;

/**
 * @class SimpleAtomicLong
 *
 * @brief This class implements a subset of the
 *        java.util.concurrent.atomic.SimpleAtomicLong class using a
 *        ReentrantReadWriteLock to illustrate how they work.
 */
class SimpleAtomicLong
{
    /**
     * The value that's manipulated atomically via the methods.
     */
    private long mValue;


    /**
     * The ReentrantReadWriteLock used to serialize access to mValue.
     */
<<<<<<< HEAD

    // TODO -- you fill in here by replacing the null with an
    // initialization of ReentrantReadWriteLock.
    private final ReentrantReadWriteLock mRWLock = new ReentrantReadWriteLock();
=======
    // TODO - add the implementation
>>>>>>> 559dcae8f1783d95447a8c54fd25a5e3beb0e67b

    /**
     * Creates a new SimpleAtomicLong with the given initial value.
     */
<<<<<<< HEAD
    public SimpleAtomicLong(long initialValue)
    {
        // TODO -- you fill in here
    	mRWLock.writeLock().lock();
    	try {
    		mValue = initialValue;
    	} finally {
    		mRWLock.writeLock().unlock();
    	}
    	
=======
    public SimpleAtomicLong(long initialValue) {
        // TODO - you fill in here
>>>>>>> 559dcae8f1783d95447a8c54fd25a5e3beb0e67b
    }

    /**
     * @brief Gets the current value
     * 
     * @returns The current value
     */
<<<<<<< HEAD
    public long get()
    {

        // TODO -- you fill in here
        mRWLock.readLock().lock();
        try{
        	return mValue;
        } finally {
        	mRWLock.readLock().unlock();
        }
        
=======
    public long get() {
        // TODO - you fill in here
>>>>>>> 559dcae8f1783d95447a8c54fd25a5e3beb0e67b
    }

    /**
     * @brief Atomically decrements by one the current value
     *
     * @returns the updated value
     */
<<<<<<< HEAD
    public long decrementAndGet()
    {

        // TODO -- you fill in here
        mRWLock.writeLock().lock();
        try{
        	return --mValue;
        } finally {
        	mRWLock.writeLock().unlock();
        }
        
=======
    public long decrementAndGet() {
        // TODO - you fill in here
>>>>>>> 559dcae8f1783d95447a8c54fd25a5e3beb0e67b
    }

    /**
     * @brief Atomically increments by one the current value
     *
     * @returns the previous value
     */
<<<<<<< HEAD
    public long getAndIncrement()
    {

        // TODO -- you fill in here
        mRWLock.writeLock().lock();
        try{
        	return mValue++;
        } finally {
        	mRWLock.writeLock().unlock();
        }

=======
    public long getAndIncrement() {
        // TODO - you fill in here
>>>>>>> 559dcae8f1783d95447a8c54fd25a5e3beb0e67b
    }

    /**
     * @brief Atomically decrements by one the current value
     *
     * @returns the previous value
     */
<<<<<<< HEAD
    public long getAndDecrement()
    {

        // TODO -- you fill in here
        mRWLock.writeLock().lock();
        try{
        	return mValue--;
        } finally {
        	mRWLock.writeLock().unlock();
        }
        
=======
    public long getAndDecrement() {
        // TODO - you fill in here
>>>>>>> 559dcae8f1783d95447a8c54fd25a5e3beb0e67b
    }

    /**
     * @brief Atomically increments by one the current value
     *
     * @returns the updated value
     */
<<<<<<< HEAD
    public long incrementAndGet()
    {

        // TODO -- you fill in here        
        mRWLock.writeLock().lock();
        try{
        	return ++mValue;
        } finally {
        	mRWLock.writeLock().unlock();
        }
        
=======
    public long incrementAndGet() {
        // TODO - you fill in here
>>>>>>> 559dcae8f1783d95447a8c54fd25a5e3beb0e67b
    }
}
