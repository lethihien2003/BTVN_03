import java.util.Scanner;

public abstract class ChuyenXe {
	protected int maSC;
	protected String hoTenTX;
	protected int soXe;
	protected float doanhThu;
	
	//constructor
	public ChuyenXe() {
		super();
	}
	
	public ChuyenXe(int maSC, String hoTenTX, int soXe, float doanhThu) {
//		super();
		this.maSC = maSC;
		this.hoTenTX = hoTenTX;
		this.soXe = soXe;
		this.doanhThu = doanhThu;
	}
	
	//get,set
	public int getMaSC() {
		return maSC;
	}

	public void setMaSC(int maSC) {
		this.maSC = maSC;
	}

	public String getHoTenTX() {
		return hoTenTX;
	}

	public void setHoTenTX(String hoTenTX) {
		this.hoTenTX = hoTenTX;
	}

	public int getSoXe() {
		return soXe;
	}

	public void setSoXe(int soXe) {
		this.soXe = soXe;
	}

	public float getDoanhThu() {
		return doanhThu;
	}

	public void setDoanhThu(float doanhThu) {
		this.doanhThu = doanhThu;
	}

	
	public abstract void nhap();
	public abstract void xuat();

	
}




	
	
	
	
	

