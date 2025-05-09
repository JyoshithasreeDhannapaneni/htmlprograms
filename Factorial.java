class Factorial
{
	public static void main(String[]args)
	{
	int n=9,r=2,n_r=n-r;
	int start=1,end=n,n_product=1;
	while(strat<=end)
	{
		n_product=n_product*start;
		start++;
	}
	System.out.pritln(n+"factorial is "+n_product);
	int nr_start=1,nr_end=nr,nr_product=1;
	while(nr_start<=nr_end)
	{
		nr_product=nr_product*nr_start;
		nr_start++;
	}
		System.out.println("n-r is" + nr+"factorial is" +nr_product);
		System.out.println(n+"p"+r+"is"+(n_product/nr_product));
	}
}		