package test.com.Maven;

 class ComplexNum {
	int real;
	int imag;
	
	public ComplexNum(int real, int imag) {
		super();
		this.real = real;
		this.imag = imag;
	}
	
	@Override
	public String toString() {
		return "ComplexNum [real=" + real + ", imag=" + imag + "]";
	}
	 public void add( ComplexNum c1,  ComplexNum c2)
	    {
	    	ComplexNum c3=new ComplexNum(imag, imag);
	    	c3.real=c1.real+c2.real;
	    	c3.imag=c1.imag+c2.imag;
	    	System.out.println(c3.real+"+i"+c3.imag);
	    	
	    }
	
}
