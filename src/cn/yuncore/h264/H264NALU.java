package cn.yuncore.h264;

import cn.yuncore.util.Utils;

public class H264NALU {

	private int type;

	private byte[] data;

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "H264NALU [type=" + Utils.getNALUTypeName(type) + " length="
				+ (data != null ? data.length : 0) + "]";
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

}
