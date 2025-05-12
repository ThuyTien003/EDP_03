package plant_zombie;

public class GameLoop {
    private EntityManager manager = new EntityManager();
    private PeaShooter peaShooter;

    public GameLoop(){
        peaShooter = new PeaShooter(5, 1);
        Zombie normalZombie = new Zombie(10, 1);
        FastZombie fastZombie = new FastZombie(12, 1);
        Sunflower sunflower = new Sunflower(3, 1);
        WallNut wallNut = new WallNut(4, 1);

        manager.add(peaShooter);
        manager.add(normalZombie);
        manager.add(fastZombie);
        manager.add(sunflower);
        manager.add(wallNut);
    }

    public void run(){
        int round = 1;
        while (manager.isZombieAlive()){
            System.out.println("\nRound " + round + " ");
            manager.updateAll();

            for (Zombie zombie : manager.getZombiesInRange(peaShooter.x, peaShooter.y, 5)){
                peaShooter.shoot(zombie);
            }
            round++;
        }
        System.out.println("\nAll zombies are dead. Plants win");
    }
}
