package com.class29;
// Create a class File that will have the following behaviors: open, edit, close. 
//Edit and close are implemented method while open is an abstract. 
//Create 3 subclasses: JavaFile, WordFile, PDFFile that 
// will provide specific implementation of open behaviour: 
//Example: to open .java file we need notepad++ or sublime text, 
//to open .doc file we need Microsoft word to be installed etc
public abstract class File {
	public abstract void open();

	public void edit() {
		System.out.println("We can edit our program");
	}

	public void close() {
		System.out.println("We can close ourprogram");
	}

}

class JavaFile extends File {

	@Override
	public void open() {
		System.out.println("To open Java file we need notepad++ or or sublime text,");
	}

}

class WordFile extends File {

	@Override
	public void open() {
		System.out.println("to open .doc file we need Microsoft word to be installed ");
	}
}

class PDFFile extends File {

	@Override
	public void open() {
		System.out.println("to open .doc file we need PDF reader to be installed");
	}

}