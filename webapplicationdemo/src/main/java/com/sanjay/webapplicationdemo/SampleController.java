package com.sanjay.webapplicationdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanjay.records.SampleRecord;

@RestController
@RequestMapping("/api/sample")
public class SampleController {

	//private final AtomicLong counter = new AtomicLong();
	public final HashMap<String,SampleRecord> sampleMap = new HashMap<>();
	

	@GetMapping("{id}")
	public SampleRecord getSample(@PathVariable String id) {
		return sampleMap.get(id);
	}

	@PostMapping()
	public ResponseEntity<SampleRecord> postSample(@RequestBody SampleRecord sr) {
		System.out.println(sr);
		sampleMap.put(sr.id(), sr);
		System.out.println("Stored keys: " + sampleMap.keySet());
        return ResponseEntity.ok(sr);
		
	
		

	}

}
