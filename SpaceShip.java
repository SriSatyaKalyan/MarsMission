public interface SpaceShip {
    boolean launch = false;
    boolean land = true;
    boolean canCarry(Item item);
    void carry(Item item);
}
