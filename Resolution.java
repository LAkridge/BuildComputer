package Buildapc;

public class Resolution
{
	//height and width
    private int height;
    private int width;

    public Resolution(int height, int width)
    {
        this.height = height;
        this.width = width;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public int getWidth()
    {
        return width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    @Override
	public String toString()
    {
		return "Resolution height=" + height + ", width=" + width + " ";
	}
}