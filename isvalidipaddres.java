package date28;
public class isvalidipaddres {
	public static void main(String[] args) {
		String input="127.199.154.1";
		input=input.replace('.',' ');
		String[] data=input.split(" ");
		int num=0;
		boolean isvalid=true;{
		}
		if (data.length!=4) isvalid=false;
		else {
			for(int i = 0;i<data.length;i++) {
				num=Integer.parseInt(data[i]);
				if( (num<0)||(num>255)) {
					isvalid=false;
					break;
				}
			}
		}
		if(isvalid==true) {
			System.out.println("valid IPv4 address");
		}
		else {
			System.out.println("notvalid IPv4 address");
			}
}
}

//output:
//valid IPv4 address