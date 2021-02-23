package _4_OOP.baitap;

public class QuadraticEquation {
        double a,b,c;
        public QuadraticEquation(double a,double b,double c){
            this.a=a;
            this.b=b;
            this.c=c;
        }
        public double getA(){
            return this.a;
        }
        public double getB(){
            return this.b;
        }
        public double getC(){
            return this.c;
        }
        public double getDiscriminant(){
            double delta=Math.pow(this.b,2)- 4*this.a*this.c;
            return delta;
        }
        public double getRoot1(){
            double root1=-this.b+Math.pow(getDiscriminant(),0.5)/(2*this.a);
            return root1;
        }
        public double getRoot2(){
            double root2=-this.b-Math.pow(getDiscriminant(),0.5)/(2*this.a);
            return root2;
        }
}
