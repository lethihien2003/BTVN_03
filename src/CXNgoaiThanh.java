import java.util.Scanner;

public class CXNgoaiThanh extends ChuyenXe {
	private String noiDen;
	private int soNgay;
	
	
	public CXNgoaiThanh(int maSC, String hoTenTX, int soXe, float doanhThu, String noiDen, int soNgay) {
		super(maSC, hoTenTX, soXe, doanhThu);
		this.noiDen = noiDen;
		this.soNgay = soNgay;
	}

	public CXNgoaiThanh() {
		
	}

	public String getNoiDen() {
		return noiDen;
	}

	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}

	public int getSoNgay() {
		return soNgay;
	}

	public void setSoNgay(int soNgay) {
		this.soNgay = soNgay;
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
		System.out.print("\tNoi den: ");
		noiDen = sc.nextLine();
		hoTenTX = sc.nextLine();
		System.out.print("\tSo ngay: ");
		soNgay = sc.nextInt();
		System.out.print("\tDoanh Thu: ");
		doanhThu = sc.nextFloat();
		
	}

	@Override
	public void xuat() {
		System.out.println("\n\tMa so chuyen: "+maSC+"\n\tHo ten tai xe: "+hoTenTX+"\n\tSo xe: "+soXe+"\n\tNoi den: "+noiDen+"\n\tSo ngay di duoc: "+soNgay+"\n\tDoanh thu: "+doanhThu);
		
	}
}