package co.com.jdti.practice.conference.controllers;

import co.com.jdti.practice.conference.models.Session;
import co.com.jdti.practice.conference.repositories.SessionRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/sessions")
public class SessionsController {

    @Autowired
    private SessionRepository sessionRepository;

    @GetMapping("/all")
    public List<Session> list() {
        return sessionRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Session get(@PathVariable Long id) {
        return sessionRepository.getOne(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Session create(@RequestBody final Session session) {
        return sessionRepository.saveAndFlush(session);
    }

    @DeleteMapping
    @RequestMapping(value = "/delete/{id}")
    public void delete(@PathVariable Long id) {
        sessionRepository.deleteById(id);
    }

    @PutMapping
    @RequestMapping(value = "/update/{id}")
    public Session update(@PathVariable Long id, @RequestBody Session session) {
        Session existingSession = sessionRepository.getOne(id);
        BeanUtils.copyProperties(session, existingSession, "idSession");
        return sessionRepository.saveAndFlush(existingSession);
    }

}
