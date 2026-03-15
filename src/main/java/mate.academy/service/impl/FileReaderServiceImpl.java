package mate.academy.service.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import mate.academy.lib.Component;
import mate.academy.service.FileReaderService;

@Component
public class FileReaderServiceImpl implements FileReaderService {

    @Override
    public List<String> readFile(String fileName) {
        List<String> result = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                result.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return result;
    }
}

