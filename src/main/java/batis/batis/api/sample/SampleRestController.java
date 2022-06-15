package batis.batis.api.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/sample")
public class SampleRestController {


    private final SampleService service;

    @Autowired
    public SampleRestController(SampleService service) {
        this.service = service;
    }

    @GetMapping
    public List<SampleResource> getList(SampleResource resource) {
        return service.findList(resource);
    }

    @GetMapping("{id}")
    public SampleResource getSample(@PathVariable("id") int id) {
        return service.findById(id);
    }

    @PostMapping
    public int insert(@RequestBody @Validated SampleResource resource) {
        return service.insert(resource);
    }

    @PutMapping
    public int update(@RequestBody @Validated SampleResource resource) {
        return service.update(resource);
    }

    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") int id) {
        return service.delete(id);
    }

}