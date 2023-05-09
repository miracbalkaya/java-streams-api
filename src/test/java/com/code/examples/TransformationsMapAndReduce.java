package com.code.examples;

import com.code.beans.Car;
import com.code.beans.Person;
import com.code.beans.PersonDTO;
import com.code.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class TransformationsMapAndReduce {

    @Test
    void yourFirstTransformationWithMap() throws IOException {
        List<Person> people = MockData.getPeople();
        List<PersonDTO> dtos = people.stream()
                .filter(person -> person.getAge() > 20)
                .map(person -> new PersonDTO(
                       person.getId(),
                        person.getFirstName(),
                        person.getAge()))
                .collect(Collectors.toList());
        dtos.forEach(System.out::println);
    }

    @Test
    void mapToDoubleAndFindAverageCarPrice() throws IOException {
        List<Car> cars = MockData.getCars();
    }

    @Test
    public void reduce() {
        int[] integers = {1, 2, 3, 4, 99, 100, 121, 1302, 199};
    }
}

