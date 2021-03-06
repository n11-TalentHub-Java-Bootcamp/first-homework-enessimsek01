package converter;

import dto.UserDto;
import dto.UserRegisterDto;
import dto.UserUpdateDto;
import entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserConverter {
    UserConverter INSTANCE = Mappers.getMapper(UserConverter.class);

    // Convert Entity To DTO
    List<UserDto> convertUserListToUserDtoList(List<User> userList);

    UserDto convertUserToUserDto(User user);



    // Convert DTO To Entity
    List<User> convertUserDtoListToUserList(List<UserDto> userDtoList);

    User convertUserDtoToUser(UserDto user);

    User convertUserRegisterDtoToUser(UserRegisterDto userRegisterDto);

    User convertUserUpdateDtoToUser(UserUpdateDto userUpdateDto);
}
