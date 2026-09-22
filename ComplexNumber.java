class ComplexNumber { 
    int real; 
    int imaginary; 
    ComplexNumber(int real, int imaginary) { 
        this.real = real; 
        this.imaginary = imaginary; 
    } 
    void add(ComplexNumber c) { 
        int realSum = this.real + c.real; 
        int imaginarySum = this.imaginary + c.imaginary; 
        System.out.println("Sum = " + realSum + " + " + imaginarySum + "i"); 
    } 
    public static void main(String[] args) { 
        ComplexNumber c1 = new ComplexNumber(4, 5); 
        ComplexNumber c2 = new ComplexNumber(3, 2); 
        c1.add(c2); 
    } 
} 