class Permute{

	public static void permuteStr(String str , int strLength){
		for(int length = 1 ; length <= strLength ; length++){
			for(int substr = 0 ; substr <= strLength - length ; substr++){
				int end = substr + length - 1 ;
				for(int i = substr ; i <= end ; i++){
					System.out.print(str.charAt(i)) ;
				}
				System.out.println() ;
			}
		}
	}

	public static void main(String[] args){
		String str = "abcdef" ;
		int strLength = str.length() ;
		permuteStr(str,strLength) ;
	}
}