package via.doc1.ex8.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {
    @Test
    void testConstructorAndGetters() {
        String id = "1";
        String name = "Task1";
        String description = "Description1";

        Task task = new Task(id, name, description);

        assertEquals(id, task.getId());
        assertEquals(name, task.getName());
        assertEquals(description, task.getDescription());
    }

    @Test
    void testSetters() {
        Task task = new Task("1", "Task1", "Description1");

        String newId = "2";
        String newName = "NewTask";
        String newDescription = "NewDescription";

        task.setId(newId);
        task.setName(newName);
        task.setDescription(newDescription);

        assertEquals(newId, task.getId());
        assertEquals(newName, task.getName());
        assertEquals(newDescription, task.getDescription());
    }

    @Test
    void testEqualsAndHashCode() {
        Task task1 = new Task("1", "Task1", "Description1");
        Task task2 = new Task("1", "Task2", "Description2");
        Task task3 = new Task("2", "Task1", "Description1");

        // Test equals method
        assertEquals(task1, task2);
        assertNotEquals(task1, task3);

        // Test hashCode method
        assertEquals(task1.hashCode(), task2.hashCode());
        assertNotEquals(task1.hashCode(), task3.hashCode());
    }

    @Test
    void testEqualsReflexive() {
        Task task1 = new Task("1", "Task1", "Description1");

        assertEquals(task1, task1);
    }

    @Test
    void testEqualsSymmetric() {
        Task task1 = new Task("1", "Task1", "Description1");
        Task task2 = new Task("1", "Task2", "Description2");

        assertEquals(task1.equals(task2), task2.equals(task1));
    }

    @Test
    void testEqualsTransitive() {
        Task task1 = new Task("1", "Task1", "Description1");
        Task task2 = new Task("1", "Task2", "Description2");
        Task task3 = new Task("1", "Task3", "Description3");

        assertTrue(task1.equals(task2) && task2.equals(task3) && task1.equals(task3));
    }

    @Test
    void testEqualsConsistency() {
        Task task1 = new Task("1", "Task1", "Description1");
        Task task2 = new Task("1", "Task2", "Description2");

        boolean initialResult = task1.equals(task2);

        assertEquals(initialResult, task1.equals(task2));
    }

    @Test
    void testEqualsWithNull() {
        Task task1 = new Task("1", "Task1", "Description1");

        assertNotEquals(task1, null);
    }
}
