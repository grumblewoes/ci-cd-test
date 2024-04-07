package via.doc1.ex8.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeamMemberTest {
    @Test
    public void testConstructorAndGetters() {
        String id = "123";
        String name = "John Doe";
        String email = "john.doe@example.com";
        List<Task> tasks = new ArrayList<>();
        TeamMember teamMember = new TeamMember(id, name, email, tasks);

        assertEquals(id, teamMember.getId());
        assertEquals(name, teamMember.getName());
        assertEquals(email, teamMember.getEmail());
        assertEquals(tasks, teamMember.getTasks());
    }

    @Test
    public void testSetters() {
        TeamMember teamMember = new TeamMember("123", "John Doe", "john.doe@example.com", new ArrayList<>());

        String id = "456";
        String name = "Jane Doe";
        String email = "jane.doe@example.com";
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("1", "Task1", "Description1"));

        teamMember.setId(id);
        teamMember.setName(name);
        teamMember.setEmail(email);
        teamMember.setTasks(tasks);

        assertEquals(id, teamMember.getId());
        assertEquals(name, teamMember.getName());
        assertEquals(email, teamMember.getEmail());
        assertEquals(tasks, teamMember.getTasks());
    }

    @Test
    public void testToString() {
        String id = "123";
        String name = "John Doe";
        String email = "john.doe@example.com";
        TeamMember teamMember = new TeamMember(id, name, email, new ArrayList<>());

        String expectedToString = "TeamMember{id='123', name='John Doe', email='john.doe@example.com'}";
        assertEquals(expectedToString, teamMember.toString());
    }
}
