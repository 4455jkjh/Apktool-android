package brut.androlib.res.decoder;

import java.io.DataInput;
import java.io.IOException;
import java.io.InputStream;

public class LittleEndianDataInput implements DataInput {
	private final InputStream proxy;

	public LittleEndianDataInput(InputStream proxy) {
		this.proxy = proxy;
	}
	@Override
	public void readFully(byte[] p1) throws IOException {
		proxy.read(p1);
	}

	@Override
	public void readFully(byte[] p1, int p2, int p3) throws IOException {
		proxy.read(p1, p2, p3);
	}

	@Override
	public int skipBytes(int p1) throws IOException {
		return (int)proxy.skip(p1);
	}

	@Override
	public boolean readBoolean() throws IOException {
		return readByte() != 0;
	}

	@Override
	public byte readByte() throws IOException {
		return (byte)proxy.read();
	}

	@Override
	public int readUnsignedByte() throws IOException {
		return proxy.read() & 0xff;
	}

	@Override
	public short readShort() throws IOException {
		int i1 = readUnsignedByte();
		int i2 = readUnsignedByte();
		return (short)(i1 | (i2 << 8));
	}

	@Override
	public int readUnsignedShort() throws IOException {
		int i1 = readUnsignedByte();
		int i2 = readUnsignedByte();
		return i1 | (i2 << 8);
	}

	@Override
	public char readChar() throws IOException {
		return (char)readShort();
	}

	@Override
	public int readInt() throws IOException {
		int i1 = readUnsignedShort();
		int i2 = readUnsignedShort();
		return i1 | (i2 << 16);
	}

	@Override
	public long readLong() throws IOException {
		long l1 = readInt() & 0xffffffff;
		long l2 = readInt() & 0xffffffff;
		return l1 | (l2 << 32);
	}

	@Override
	public float readFloat() throws IOException {
		return Float.intBitsToFloat(readInt());
	}

	@Override
	public double readDouble() throws IOException {
		return Double.longBitsToDouble(readLong());
	}

	@Override
	public String readLine() throws IOException {
		
		return null;
	}

	@Override
	public String readUTF() throws IOException {
		// TODO: Implement this method
		return null;
	}

}
