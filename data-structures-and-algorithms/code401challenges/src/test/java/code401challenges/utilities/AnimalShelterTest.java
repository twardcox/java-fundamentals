//package code401challenges.utilities;
//
//import org.junit.Test;
//
//import static org.junit.Assert.assertNotNull;
//public class AnimalShelterTest {
//
//    @Test
//    public void testEnqueueDog_Happy() {
//        AnimalShelter<Object> animalShelter = new AnimalShelter<>();
//        Dog dog1 = new Dog("canine", "legs", "smell", "Wilbur","dalmatian","short",3);
//        Dog dog2 = new Dog("canine", "legs", "smell", "barney","retriever","short",4);
//        animalShelter.enqueue(dog1);
//        animalShelter.enqueue(dog2);
//        System.out.println(animalShelter.toString());
//        assertNotNull(animalShelter.getDogs());
//
//    }
//
////    @Test
////    public void testEnqueueCat_Happy() {
////        AnimalShelter<Object> animalShelter = new AnimalShelter<>();
////        Cat cat1 = new Cat("feline", "legs", "sight", "fluffy", "scaredy", "long", 3);
////        Cat cat2 = new Cat("feline", "legs", "sight", "spot", "dumb", "short", 4);
////        animalShelter.enqueue(cat1);
////        animalShelter.enqueue(cat2);
//////    System.out.println(animalShelter.toString());
////        assertTrue(animalShelter.getCats() != null);
////    }
////
////    @Test
////    public void testDequeue_Happy() {
////        AnimalShelter<Object> animalShelter = new AnimalShelter<>();
////        Cat cat1 = new Cat("feline", "legs", "sight", "fluffy", "scaredy", "long", 3);
////        Cat cat2 = new Cat("feline", "legs", "sight", "spot", "dumb", "short", 4);
////        animalShelter.enqueue(cat1);
////        animalShelter.enqueue(cat2);
////        Dog dog1 = new Dog("canine", "legs", "smell", "Wilbur","dalmatian","short",3);
////        Dog dog2 = new Dog("canine", "legs", "smell", "barney","retriever","short",4);
////        animalShelter.enqueue(dog1);
////        animalShelter.enqueue(dog2);
//////      System.out.println(animalShelter.dequeue("dog").toString());
////        assertEquals("whats going on","Dog{name='Wilbur', breed='dalmatian', hairLength='short', age=3}", animalShelter.dequeue("dog").toString());
////
////    }
//}