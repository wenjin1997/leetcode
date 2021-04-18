package leetcode;

public class AddBinary {
	public static void main(String[] args)
	{
		String a = "1101";
		String b = "11";
		StringBuilder ans = new StringBuilder();
		int n = Math.max(a.length(), b.length()), carry = 0;
		for(int i = 0; i < n; ++i)
		{
			carry += i < a.length() ? (a.charAt(a.length() - 1 - i) - '0') : 0;
			carry += i < b.length() ? (b.charAt(b.length() - 1 - i) - '0') : 0;
			ans.append((char)(carry % 2 + '0'));
			carry = carry / 2;	
		}
		
		if(carry > 0)
		{
			ans.append('1');
		}
		
		ans.reverse();
		System.out.println(ans.toString());
	}

}
