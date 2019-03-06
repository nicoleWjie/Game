package com.game.service;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import com.game.service.impl.GameServiceImpl;

public class TestGameService {
	GameService gameService = null;

	@Before
	public void initialize() throws Exception {
		gameService = GameServiceImpl.class.newInstance();

	}

	@Test
	public void testFizzbuzzFun() {
		TestCase.assertEquals(101, gameService.fizzbuzzFun());

	}

	@Test
	public void testFizzbuzzFunString() {
		TestCase.assertEquals("1", gameService.fizzbuzzFun("1"));
		TestCase.assertEquals("Fizz", gameService.fizzbuzzFun("3"));
		TestCase.assertEquals("Buzz", gameService.fizzbuzzFun("5"));
		TestCase.assertEquals("FizzBuzz", gameService.fizzbuzzFun("15"));
		TestCase.assertEquals("Fizz", gameService.fizzbuzzFun("-3"));
		TestCase.assertEquals("Buzz", gameService.fizzbuzzFun("-5"));
		TestCase.assertEquals("-22", gameService.fizzbuzzFun("-22"));
		TestCase.assertEquals("Fizz", gameService.fizzbuzzFun("-3.0"));
		TestCase.assertEquals("Buzz", gameService.fizzbuzzFun("-5.1"));
		TestCase.assertEquals("FizzBuzz", gameService.fizzbuzzFun("-5.3"));
		TestCase.assertEquals("-9.9", gameService.fizzbuzzFun("-9.9"));
		TestCase.assertEquals("77777777777777777777777777777",
				gameService.fizzbuzzFun("77777777777777777777777777777"));
		TestCase.assertEquals("N/A",
				gameService.fizzbuzzFun("77777777777ss777777777777777777"));
	}

}
