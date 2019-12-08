package com.class31;


	 class Circle implements Shape {
		int radius=7;
		double pi = 3.14;

		@Override
		public void calculateArea() {
			System.out.println("Area of the circle: " + pi * radius * radius);
		}

		@Override
		public void calculatePerimeter() {
			System.out.println("Perimeter of the circle: " + 2 * pi * radius);

		}

	}

