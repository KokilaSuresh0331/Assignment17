package com.assignment17;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CpuScheduler {
	 public static void main(String[] args) {
		 	Scanner scanner = new Scanner(System.in);
	        Queue<Job> jobQueue = new LinkedList<>();
	        System.out.print("Enter the number of jobs: ");
	        int numJobs = scanner.nextInt();
	       
	        for (int i = 0; i < numJobs; i++) {
	            System.out.println("Enter details for Job " + (i + 1));
	            System.out.print("Process Time: ");
	            int processTime = scanner.nextInt();
	            System.out.print("Arrival Time: ");
	            int arrivalTime = scanner.nextInt();
	            System.out.print("Priority (higher = more important): ");
	            int priority = scanner.nextInt();

	            jobQueue.add(new Job(processTime, arrivalTime, priority));
	        }
	        int currentTime = 0;
	        int totalWaitingTime = 0;
	        int totalTurnaroundTime = 0;
	        while (!jobQueue.isEmpty()) {
	            Job currentJob = jobQueue.poll();
	            int waitingTime = currentTime - currentJob.arrivalTime;
	            int turnaroundTime = waitingTime + currentJob.processTime;

	            System.out.println("Job " + (jobQueue.size() + 1) + ": Waiting Time = " + waitingTime + ", Turnaround Time = " + turnaroundTime);

	            totalWaitingTime += waitingTime;
	            totalTurnaroundTime += turnaroundTime;
	            currentTime += currentJob.processTime;
	        }

	        System.out.println("Average Waiting Time: " + (double) totalWaitingTime / (jobQueue.size() + 1));
	        System.out.println("Average Turnaround Time: " + (double) totalTurnaroundTime / (jobQueue.size() + 1));
	   }
	 
	 
	 
	}



