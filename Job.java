package com.assignment17;

class Job {
	
	int processTime;
    int arrivalTime;
    int priority;

    public Job(int processTime, int arrivalTime,int priority) {
        this.processTime = processTime;
        this.arrivalTime = arrivalTime;
        this.priority=priority;
    }
}
