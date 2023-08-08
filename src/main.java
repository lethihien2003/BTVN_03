import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		ChuyenXe nt = new CXNoiThanh();
		ChuyenXe ngt = new CXNgoaiThanh();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nCHUONG TRINH QUAN LI CAC CHUYEN XE!\n");
		System.out.print("Nhap vao so luong chuyen xe noi thanh n = ");
		int n = sc.nextInt();
	
		CXNoiThanh a[] = new CXNoiThanh[n];
		for (int i = 1; i <= n; i++) {
			System.out.println("\nNhap vao thong tin chuyen xe noi thanh:");
			System.out.print("Chuyen xe noi thanh thu " + i + ": \n");
			nt.nhap();
			
		}

		System.out.print("\nNhap vao so luong chuyen xe ngoai thanh m = ");
		int m = sc.nextInt();
		
		CXNgoaiThanh b[] = new CXNgoaiThanh[m];
		for (int i = 1; i <= n; i++) {
			System.out.println("\nNhap vao thong tin chuyen xe ngoai thanh:");
			System.out.print("Chuyen xe noi thanh thu " + i + ": \n");
			ngt.nhap();
		}
		
		System.out.println("\nThong tin chuyen xe noi thanh da nhap:");
		for (int i = 1; i <= n; i++) {
			System.out.print("Chuyen xe noi thanh thu " + i + ": \n");
			nt.xuat();
		}
		
		System.out.println("\nThong tin chuyen xe ngoai thanh da nhap:");
		for (int i = 1; i <= n; i++) {
			System.out.print("Chuyen xe noi thanh thu " + i + ": \n");
			ngt.xuat();
		}
		
		double s1=0, s2=0;
		for(int i=0; i<= a.length; i++) {
			s1 += a[i].doanhThu;
		}
		System.out.println("Tong doanh thu cho xe noi thanh la: "+s1);
		for(int i=0; i<=m; i++) {
			s2 += b[i].doanhThu;
		}
		System.out.println("Tong doanh thu cho xe ngoai thanh la: "+s2);
			
	}

	
	
}





