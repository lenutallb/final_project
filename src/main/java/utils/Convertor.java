package utils;

import dto.UserDto;
import entities.User;

public class Convertor {
    public static UserDto convertEntityToDto(User user) {
        UserDto userDto = new UserDto();
        String name = user.getName();
        userDto.setName(name);
        userDto.setEmail(user.getEmail());
        return userDto;
    }
}
