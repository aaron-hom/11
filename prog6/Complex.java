//Complex.java
//Aaron Hom and Zimraan Hamid
//awhom and zjhamid
//pa6
//Represents complex numbers as a pair of doubles

class Complex {

    // Private Data Fields
    private double re;
    private double im;

    // Public Constant Fields
    public static final Complex ONE = Complex.valueOf(1,0);
    public static final Complex ZERO = Complex.valueOf(0,0);
    public static final Complex I = Complex.valueOf(0,1);

    // Constructors
    Complex(double a, double b) {
        this.re = a;
        this.im = b;
    }

    Complex(double a) {
        this.re = a;
        this.im = 0;
    }

    Complex(String s) {
        double[] Z = parseComplex(s);
        this.re = Z[0];
        this.im = Z[1];
    }

    // parseComplex()
    // Returns a double[] of length 2 containing (real, imaginary) parts
    // of a complex number represented by string argument str.  Throws a
    // NumberFormatException if str cannot be parsed as a complex number.
    static double[] parseComplex(String str) {
        double[] part = new double[2];
        String s = str.trim();
        String NUM = "(\\d+\\.\\d*|\\.?\\d+)";
        String SGN = "[+-]?";
        String OP =  "\\s*[+-]\\s*";
        String I =   "i";
        String OR =  "|";
        String REAL = SGN+NUM;
        String IMAG = SGN+NUM+"?"+I;
        String COMP = REAL+OR+
                      IMAG+OR+
	    REAL+OP+NUM+"?"+I;
        if ( !s.matches(COMP) ) {
            throw new NumberFormatException("Cannot parse input string \""+s+"\" as Complex");
        }
        s = s.replaceAll("\\s","");
        if ( s.matches(REAL) ) {
            part[0] = Double.parseDouble(s);
            part[1] = 0;
        } else if ( s.matches(SGN+I) ) {
            part[0] = 0;
            part[1] = Double.parseDouble( s.replace( I, "1.0" ) );
        } else if ( s.matches(IMAG) ) {
            part[0] = 0;
            part[1] = Double.parseDouble( s.replace( I , "" ) );
        } else if ( s.matches(REAL+OP+I) ) {
            part[0] = Double.parseDouble( s.replaceAll( "("+REAL+")"+OP+".+" , "$1" ) );
            part[1] = Double.parseDouble( s.replaceAll( ".+("+OP+")"+I , "$1"+"1.0" ) );
        } else { //  s.matches(REAL+OP+NUM+I)
            part[0] = Double.parseDouble( s.replaceAll( "("+REAL+").+"  , "$1" ) );
            part[1] = Double.parseDouble( s.replaceAll( ".+("+OP+NUM+")"+I , "$1" ) );
        }
        return part;
    }

    // Public methods & Complex arithmetic

    // copy()
    // Returns a new Complex equal to this Complex
    Complex copy() {
        double x = this.re;
        double y = this.im;
        return new Complex (x,y);
    }

    // add()
    // Return a new Complex representing the sum this plus z.
    Complex add(Complex z) {
        Complex w = this;
        double realVal = w.re+z.re;
        double imaginaryVal = w.im+z.im;
        return new Complex(realVal, imaginaryVal);
    }

    // negate()
    // Return a new Complex representing the negative of this.
    Complex negate() {
        double x = -1;
        double y;
        double z;
        y = re*x;
        z=im*x;
        return new Complex (y, z);
    }

    // sub()
    // Return a new Complex representing the difference this minus z.
    Complex sub(Complex z) {
        Complex w = this;
        double realVal = w.re-z.re;
        double imaginaryVal = w.im-z.im;
        return new Complex(realVal, imaginaryVal);
    }

    // mult()
    // Return a new Complex representing the product this times z.
    Complex mult(Complex z) {
        Complex w = this;
        double realVal = w.re * z.re - w.im * z.im;
        double imaginaryVal = w.re * z.im + w.im * z.re;
        return new Complex(realVal, imaginaryVal);
    }

    // recip()
    // Return a new Complex representing the reciprocal of this.
    // Throw an ArithmeticException with appropriate message if
    // this.equals(Complex.ZERO).
    Complex recip() {
        double divisor = re*re + im*im;
        return new Complex(re/divisor, -im/divisor);
    }

    // div()
    // Return a new Complex representing the quotient of this by z.
    // Throw an ArithmeticException with appropriate message if
    // z.equals(Complex.ZERO).
    Complex div(Complex z) {
        if (z.equals(Complex.ZERO)) {
            throw new ArithmeticException("Don't divide by 0");
        }
        return this.mult(z.recip());
    }

    // conj()
    // Return a new Complex representing the conjugate of this Complex.
    Complex conj() {
        return new Complex( re,  -im);
    }

    // Re()
    // Return the real part of this.
    double Re() {
        return re;
    }

    // Im()
    // Return the imaginary part of this.
    double Im() {
        return im;
    }

    // abs()
    // Return the modulus of this Complex, i.e. the distance between
    // points (0, 0) and (re, im).
    double abs() {
        double x = (im-0)*(im-0);
        double y = (re-0)*(re-0);
        double z = x*y;
        double w = Math.sqrt(z);
        return w;
    }

    // arg()
    // Return the argument of this Complex, i.e. the angle this Complex
    // makes with positive real axis.
    double arg() {
        return Math.atan2(im, re);
    }

    // toString()
    // Return a String representation of this Complex.
    // The String returned will be readable by the constructor Complex(String s)
    public String toString() {
	if (im==0) {
	    return im+"i";
	}
	else if (re==0) {
	    return String.valueOf(re);
	}
	else if (re != 0 && im < 0) {
	    return re+"-"+(-im)+"i";
	}
	else if (re != 0 && im > 0) {
	    return re+"+"+im+"i";
	}
	return re + "+i"+im;
    }

    // equals()
    // Return true iff this and obj have the same real and imaginary parts.
    public boolean equals(Object obj) {
	boolean test = false;
	Complex w = (Complex) obj;
	if ((w.re == this.re && w.im == this.im) == true) {
	    test = true;
	}
	return test;
    }

    // valueOf()
    // Return a new Complex with real part a and imaginary part b.
    static Complex valueOf(double a, double b) {
        double realVal = a;
        double ImVal = b;
        return new Complex(realVal, ImVal);
    }

    // valueOf()
    // Return a new Complex with real part a and imaginary part 0.
    static Complex valueOf(double a) {
        double realVal = a;
        double ImVal = 0;
        return new Complex(realVal, ImVal);
    }

    // valueOf()
    // Return a new Complex constructed from s.
    static Complex valueOf(String s) {
        return new Complex(s);
    }
}
