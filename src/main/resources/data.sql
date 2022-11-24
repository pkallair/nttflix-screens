DROP TABLE IF EXISTS SCREENS; 

CREATE TABLE SCREENS ( 

		ID INT GENERATED BY DEFAULT AS IDENTITY(START WITH 1) PRIMARY KEY, 

		DEVICE VARCHAR(255), 

		MAC VARCHAR(255), 

		USERNAME VARCHAR(255) );

INSERT INTO SCREENS (DEVICE, MAC, USERNAME) VALUES ('SMARTPHONE', '11:22:33:44:55:00', 'fulanito'); 
 
INSERT INTO SCREENS (DEVICE, MAC, USERNAME) VALUES ('TABLET', '11:22:33:44:55:01', 'menganito'); 
INSERT INTO SCREENS (DEVICE, MAC, USERNAME) VALUES ('SMARTPHONE', '11:22:33:44:55:02', 'menganito');

INSERT INTO SCREENS (DEVICE, MAC, USERNAME) VALUES ('TABLET', '10:22:33:44:55:FF', 'pepito'); 
INSERT INTO SCREENS (DEVICE, MAC, USERNAME) VALUES ('SMARTPHONE', '10:22:33:44:55:FE', 'pepito'); 
INSERT INTO SCREENS (DEVICE, MAC, USERNAME) VALUES ('SMART TV', '15:22:33:44:55:FD', 'pepito'); 
 
INSERT INTO SCREENS (DEVICE, MAC, USERNAME) VALUES ('SMART TV', '11:22:FF:44:55:66', 'juanito'); 
INSERT INTO SCREENS (DEVICE, MAC, USERNAME) VALUES ('TABLET', '11:22:33:44:FF:66', 'juanito'); 
INSERT INTO SCREENS (DEVICE, MAC, USERNAME) VALUES ('SMARTPHONE', '11:22:33:44:55:AA', 'juanito'); 

INSERT INTO SCREENS (DEVICE, MAC, USERNAME) VALUES ('TABLET', '11:0F:33:44:55:66', 'ramoncito'); 

INSERT INTO SCREENS (DEVICE, MAC, USERNAME) VALUES ('SMARTPHONE', '1D:22:33:40:55:66', 'ramoncito'); 

INSERT INTO SCREENS (DEVICE, MAC, USERNAME) VALUES ('SMARTPHONE', '11:22:DC:44:55:ED', 'miguelito'); 

INSERT INTO SCREENS (DEVICE, MAC, USERNAME) VALUES ('SMARTPHONE', '11:AC:33:B0:55:66', 'javielito'); 
INSERT INTO SCREENS (DEVICE, MAC, USERNAME) VALUES ('TABLET', '11:22:A1:44:55:66', 'javielito'); 

INSERT INTO SCREENS (DEVICE, MAC, USERNAME) VALUES ('SMART TV', '11:02:33:F0:55:EF', 'alfonsito'); 
INSERT INTO SCREENS (DEVICE, MAC, USERNAME) VALUES ('SMART TV', '11:22:D8:44:55:66', 'alfonsito'); 

INSERT INTO SCREENS (DEVICE, MAC, USERNAME) VALUES ('SMARTPHONE', '11:00:33:44:96:66', 'julito'); 
INSERT INTO SCREENS (DEVICE, MAC, USERNAME) VALUES ('TABLET', '10:22:33:DE:55:66', 'julito'); 
INSERT INTO SCREENS (DEVICE, MAC, USERNAME) VALUES ('SMART TV', '10:20:03:DE:55:66', 'julito'); 