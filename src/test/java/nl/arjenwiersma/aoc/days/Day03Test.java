package nl.arjenwiersma.aoc.days;

import nl.arjenwiersma.aoc.common.Day;
import nl.arjenwiersma.aoc.common.DayInputExternalResource;
import org.junit.Rule;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Day03Test {
    @Rule
    public DayInputExternalResource input = new DayInputExternalResource(03);

    @Test
    public void part1() {
        Day<Integer> day = new Day03();
        assertEquals(Integer.valueOf(2261546), day.part1(input.getLines()));
    }

    @Test
    public void part2() {
        Day<Integer> day = new Day03();
        assertEquals(Integer.valueOf(0), day.part2(input.getLines()));
    }

    @Test
    public void sample(){
        List<String> sample = Arrays.stream(new String[]{"00100",
                "11110",
                "10110",
                "10111",
                "10101",
                "01111",
                "00111",
                "11100",
                "10000",
                "11001",
                "00010",
                "01010"}).toList();

        Day<Integer> day = new Day03();
        assertEquals(Integer.valueOf(0), day.part1(sample));
    }
}
