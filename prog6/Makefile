# Makefile
# Aaron Hom and Zimraan Hamid
# awhom and zjhamid
# pa6
# A makefile for Complex.java

ComplexTest: ComplexTest.class Complex.class
	echo Main-class: ComplexTest > Manifest
	jar cvfm ComplexTest Manifest ComplexTest.class Complex.class
	rm Manifest
	chmod u+x ComplexTest

ComplexTest.class: ComplexTest.java Complex.java 
	javac -Xlint ComplexTest.java

Complex.class: Complex.java
	javac -Xlint Complex.java

clean:
	rm -f Complex.class ComplexTest.class

spotless:
	rm -f ComplexTest Complex.class ComplexTest.class

submit:
	submit cmps011-pt.w16 pa6 Complex.java ComplexTest.java Makefile
