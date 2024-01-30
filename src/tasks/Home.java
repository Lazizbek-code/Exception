package tasks;

public class Home {
    private int floor;
    private String color;
    private int roomCount;
    private String personName;

    public Home() {
    }

    public Home(int floor, String color, int roomCount, String personName)
            throws FloorCantBeLessThanZeroException, ColorCantBeBlankException,
            RoomCountCantBeLessThanTenException, PersonNameCantBeBlankException {
        setFloor(floor);
        setColor(color);
        setRoomCount(roomCount);
        setPersonName(personName);
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) throws FloorCantBeLessThanZeroException {
        if (floor < 0) {
            throw new FloorCantBeLessThanZeroException("Qavat 0 dan kichik bo'lishi mumkin emas.");
        }
        this.floor = floor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) throws ColorCantBeBlankException {
        if (color == null || color.trim().isEmpty()) {
            throw new ColorCantBeBlankException("Rangi null yoki bo'sh bo'lishi mumkin emas.");
        }
        this.color = color;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) throws RoomCountCantBeLessThanTenException {
        if (roomCount < 10) {
            throw new RoomCountCantBeLessThanTenException("RoomCount 10 dan kichik bo'lishi mumkin emas.");
        }
        this.roomCount = roomCount;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) throws PersonNameCantBeBlankException {
        if (personName == null || personName.trim().isEmpty()) {
            throw new PersonNameCantBeBlankException("PersonName null yoki bo'sh bo'lishi mumkin emas.");
        }
        this.personName = personName;
    }


    public static void main(String[] args) {
        try {
            Home myHome = new Home(0, "", 12, "John Doe");
            System.out.println("Floor: " + myHome.getFloor());
            System.out.println("Color: " + myHome.getColor());
            System.out.println("Room count: " + myHome.getRoomCount());
            System.out.println("Person name: " + myHome.getPersonName());
        } catch (Exception e) {
            System.out.println("Exception : " + e.getMessage());
        }

    }


}

class FloorCantBeLessThanZeroException extends Exception {
    public FloorCantBeLessThanZeroException(String message) {
        super(message);
    }
}

class ColorCantBeBlankException extends Exception {
    public ColorCantBeBlankException(String message) {
        super(message);
    }
}

class RoomCountCantBeLessThanTenException extends Exception {
    public RoomCountCantBeLessThanTenException(String message) {
        super(message);
    }
}

class PersonNameCantBeBlankException extends Exception {
    public PersonNameCantBeBlankException(String message) {
        super(message);
    }
}
