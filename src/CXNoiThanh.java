import java.util.Scanner;

public class CXNoiThanh extends ChuyenXe{
	private int soTuyen;
	private double soKM;
	
	public CXNoiThanh(int maSC, String hoTenTX, int soXe, float doanhThu, int soChuyen, double soKM) {
		super(maSC, hoTenTX, soXe, doanhThu);
		this.soTuyen = soChuyen;
		this.soKM = soKM;
	}

	public CXNoiThanh() {
		// TODO Auto-generated constructor stub
	}

	public int getSoChuyen() {
		return soTuyen;
	}

	public void setSoChuyen(int soChuyen) {
		this.soTuyen = soTuyen;
	}

	public double getSoKM() {
		return soKM;
	}

	public void setSoKM(double soKM) {
		this.soKM = soKM;
	}

	@Override
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\tMa so chuyen: ");
		maSC = sc.nextInt();
		System.out.print("\tHo ten tai xe: ");
		hoTenTX = sc.nextLine();
		hoTenTX = sc.nextLine();
		System.out.print("\tSo xe: ");
		soXe = sc.nextInt();
		System.out.print("\tSo tuyen: ");
		soTuyen = sc.nextInt();
		System.out.print("\tSo km di duoc: ");
		soKM = sc.nextDouble();
		System.out.print("\tDoanh Thu: ");
		doanhThu = sc.nextFloat();
		
	}

	@Override
	public void xuat() {
		System.out.println("\tMa so chuyen: "+maSC+"\n\tHo ten tai xe: "+hoTenTX+"\n\tSo xe: "+soXe+"\n\tSo tuyen: "+soTuyen+"\n\tSo km di duoc: "+soKM+"\n\tDoanh thu: "+doanhThu);
		
	}


	

}