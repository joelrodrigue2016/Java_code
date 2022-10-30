/*
* 6.19 The elevation of point C on the chimney shown in Figure 6.3 is desired. Field angles and distances are observed.
* Station A has an elevation of 345.36 ± 0.03 ft and Station B has an elevation of 353.86 ± 0.03. The instrument height,
* hiA, at Station A is 5.53 ± 0.02 ft and the instrument height, hiB, at Station B is 5.52 ± 0.02 ft. Zenith angles are
* read in the field. The other observations and their estimated errors are
* */
import static java.lang.Math.*;

public class HM6_Satellites {

    public static void main(String[] args) {

        //% Elevations
        double eA=345.36;
        double eB=353.86;
        //% errors in elevations
        double SeA=0.03;
        double SeB=0.03;
        //% instrument height and their errors
        double hiA=5.53;
        double ShiA=0.02;
        double hiB=5.52;
        double ShiB=0.02;
        //% distance AB and error
        double AB=203.56;
        double SAB=0.02;
        final double pi = PI;


        //% A = 43°15’21” ± 6.8” B = 42°02’36” ± 5.7”
        //% Angle A and its error
        double A=(43+15/60+21/3600)*pi/180;
        double SA=(6.8/3600)*pi/180;

        //Angle B and its error
        double B=(42+02/60+36/3600)*pi/180;
        double SB=(5.7/3600)*pi/180;


        ///v1 = 79°22’10” ± 12.3” v2 = 83°00’48” ± 9.8”
        //Vertical angle v1 and its error
        double v1=(79+22/60+10/3600)*pi/180;
        double Sv1=(12.3/3600)*pi/180;
        //Vertical angle v2 and its error
        double v2=(83+00/60+48/3600)*pi/180;
        double Sv2=(9.8/3600)*pi/180;
        //Elevation of C
        double eC=0.5*(eA+hiA+(AB*Math.sin(B)*Math.tan(v1)/Math.sin((A+B)))+
                eB+hiB+(AB*Math.sin(A)*Math.tan(v2)/Math.sin((A+B))));
        double deA= 0.5;
        double deB= 0.5;
        double dhiA= 0.5;
        double dhiB= 0.5;
        double dAB= 0.5*((Math.sin(B)*Math.tan(v1)+Math.sin(A)*Math.tan(v2))/Math.sin(A+B));

        double dA=0.5*AB*((-Math.cos(A+B)*(Math.sin(B)*Math.tan(v1)+
                Math.sin(A)*Math.tan(v2)))/Math.pow(Math.sin(A+B),2) +
                (Math.cos(A)*Math.tan(v2)/Math.sin(A+B)));

        double dB=0.5*AB*((-Math.cos(A+B)*(Math.sin(B)*Math.tan(v1)+
                Math.sin(A)*Math.tan(v2))/Math.pow(Math.sin(A+B),2)+
                (Math.cos(B)*Math.tan(v1)/Math.sin(A+B))));

        double dv1=0.5*AB*Math.sin(B)/(Math.sin(A+B))*Math.pow(Math.cos(v1),2);

        double dv2=0.5*AB*Math.sin(A)/(Math.sin(A+B)*Math.pow(Math.cos(v2),2));
        //% Error in elevation of C

        double veC=Math.pow((deA*SeA),2)+Math.pow((deB*SeB),2)+Math.pow((dhiA*ShiA),2)+Math.pow((dhiB*ShiB),2)+
                Math.pow((dA*SA),2)+Math.pow((dB*SB),2)+
                Math.pow((dv1*Sv1),2)+Math.pow((Sv2*Sv2),2)+Math.pow((dAB*SAB),2);
        double SeC=Math.sqrt(veC);

        System.out.println("----------------------------");
        System.out.println("A: " + A);
        System.out.println("SA:" + SA);
        System.out.println("SB: " + SB );
        System.out.println("Sv1: "+Sv1);
        System.out.println("v2: "+v2);
        System.out.println("Sv2: " + Sv2);
        System.out.println("dAB: " + dAB);
        System.out.println("dA: " + dA);
        System.out.println("dB: " + dB);
        System.out.println("dv1: " + dv1);
        System.out.println("dv2: " + dv2);
        System.out.println("veC: " + veC);
        System.out.println("seC: " + SeC);
        System.out.println("----------------------------");
        System.out.println("Done by Joel Rodriguez");
        System.out.println("----------------------------");



    }
}
