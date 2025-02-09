package BasicLogicBuilding;


class GeometricProgression2{
	static float sumOfGP(float a, float r, int n)
	{
		return (a * (1 - (int)(Math.pow(r, n)))) / 
											(1 - r);
	}

	public static void main(String args[])
	{
		float a = 2;
		float r = 2;
		int n = 15;
		System.out.println((int)(sumOfGP(a, r, n)));
	}
}