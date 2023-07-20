package com.icarlosalbertojr.demosecurity.config;

/*@Configuration
@RequiredArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final UserDetailsService userDetailsService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
        .httpBasic()
        .and()
        .authorizeHttpRequests()
        .antMatchers(HttpMethod.POST, "/auth").hasRole("ADMIN")
        .antMatchers(HttpMethod.GET, "/auth").hasRole("USER")
        .anyRequest().authenticated()
        .and()
        .csrf().disable();
    }


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService)
            .passwordEncoder(passwordEncoder());
    }

    @Bean
    protected BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}*/
