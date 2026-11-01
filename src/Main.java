void main() {
    double vize1=60.0;
    double vize2=70.0;
    double final1=75.0;
    double vize1ort=vize1/4;
    double vize2ort=vize2/4;
    double final1ort=final1/2;
    double not1=vize1ort+vize2ort+final1ort;
    String x=("Takdir Aldin");
    String y=("Teşekkür Aldın");
    String z=("Geçtin");
    String q=("Kaldın");
    if (not1>85) {
        System.out.println(x);
    } else if (not1>=75) {
        System.out.println(y);
    } else if (not1>=50) {
        System.out.println(z);
    }
    else {
        System.out.println(q);
    }

}