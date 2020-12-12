public class BehindTheDoor implements Roaring, Sneezing, CracklingAndRinging{
    private final Noises noise;
    public BehindTheDoor(Noises noise){
        this.noise = noise;
    }

    public void makingNoises(BehindTheDoor b){
        if(b.noise == Noises.ROAR)
            roar();
        else if(b.noise == Noises.CRACKANDRING)
            crackAndRing();
        else
            sneeze();
    }
    @Override
    public void roar() {
        System.out.println("Noize inside: *somebody screaming*");
    }

    @Override
    public void crackAndRing() {
        System.out.println("Noise inside: *somebody smashing the dishes*");
    }

    @Override
    public void sneeze() {
        System.out.println("Noise inside: *somebody sneezing*");
    }
}