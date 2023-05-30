package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
        private int marks ;

		public int getMarks() {
			return marks;
		}

		public void setMarks(int marks) {
			this.marks = marks;
		}

		@Override
		public String toString() {
			return "Example [marks=" + marks + "]";
		}

		public Example() {
			super();
			// TODO Auto-generated constructor stub
		}
        
		@PostConstruct
		public void start() {
			System.out.println("starting method...");
		}
		@PreDestroy
		public void end() {
			System.out.println("ending method...");
		}
}
