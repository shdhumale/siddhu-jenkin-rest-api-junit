package com.test.siddhu.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
//import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.test.siddhu.controller.StudentsController;

import com.test.siddhu.Students;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( classes = TestConfiguration.class )
public class StudentsControllerTest {

	private MockMvc mockMvc;

	@Mock
	Students students;

	@Autowired
	@InjectMocks
	@Qualifier("studentsController")
	StudentsController studentsController;

	@Before
	public void setUp() {
		//MockitoAnnotations.initMocks(this);
		mockMvc = MockMvcBuilders.standaloneSetup(new StudentsController()).build();
	}

	@Test
	public void testSaveUser() throws Exception {
		
		RequestBuilder requestBuilder = MockMvcRequestBuilders
				.get("/students/1")
				.accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		System.out.println(result.getResponse().getContentAsString());

		String expected = "{\"id\":1,\"studentsName\":\"First\"}";
		//JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);
		//by sdhumale to execute method of controller
		/*Students objStudents = studentsController.getStudentsById(1);
		Assert.assertNotNull( objStudents );
		Assert.assertEquals( objStudents.getId() , objStudents.getId() );*/

	}

}
