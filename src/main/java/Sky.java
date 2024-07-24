public class Sky extends Environment<Flyable> {
    @Override
    public void checkTraffic() {
           for (Flyable item: traffic) {
//               item.fly();
               System.out.println(item.getClass().getSimpleName() + " is flying!");
        }
    }
}
