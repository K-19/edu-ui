package by.k19.eduui.model;

import lombok.*;


@EqualsAndHashCode
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
    private Long id;
    @NonNull
    private String login;
    @NonNull
    private String password;
}
