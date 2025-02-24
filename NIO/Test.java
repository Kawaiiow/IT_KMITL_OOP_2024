package NIO;

import java.io.IOException;
import java.nio.*;
import java.nio.channels.SocketChannel;

public class Test {
	public static void main(String[] args) throws IOException {
		SocketChannel	socketChannel = SocketChannel.open();
		ByteBuffer		buffer = ByteBuffer.allocate(48);

		socketChannel.configureBlocking(false);
		socketChannel.close();
	}
}
