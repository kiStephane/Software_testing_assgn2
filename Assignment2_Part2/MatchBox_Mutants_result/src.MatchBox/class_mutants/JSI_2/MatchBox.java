// This is mutant program.
// Author : ysma

package src;


class Box1
{

    double width;

    static double height;

    double depth;

    double vol;

    Box1()
    {
    }

    public Box1( double w, double h, double d )
    {
        width = w;
        height = h;
        depth = d;
    }

    public double getVolume()
    {
        System.out.println( "Volume is : " + this.vol );
        return this.vol;
    }

    public void setVolume()
    {
        vol = width * height * depth;
    }

}

public class MatchBox extends src.Box1
{

    double weight;

    static double result = 0;

    public MatchBox()
    {
    }

    public MatchBox( double w, double h, double d, double m )
    {
        super( w, h, d );
        weight = m;
    }

}
