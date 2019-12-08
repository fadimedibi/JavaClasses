package com.class31;


	public  class Square implements Shape {
		int side=4;

		@Override
		public void calculateArea() {
			System.out.println("Area of the square: "+ side * side);
		}

		@Override
		public void calculatePerimeter() {
			System.out.println("Perimeter of the square:  "+ 4 * side);

		}

	}
