import socket

serversocket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
serversocket.bind(('192.168.2.35', 8089))
serversocket.listen(5)

while True:
	connection, address = serversocket.accept()
	buf = connection.recv(64)
	if len(buf) > 0:
		print buf
		if buf == 'jachega':
			break
