CC = javac

all : ShipLog.class

ShipLog.class : Ship.class Weapon.class
	$(CC) ShipLog.java

%.class : 
	$(CC) $*.java

.PHONY: clean
clean :
	rm -f *.class
