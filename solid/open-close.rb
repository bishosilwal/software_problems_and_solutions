require 'abstraction'

class Car
  abstract

  def go_forward
    # ...
  end
end

Car.new
#> AbstractClassError: Car is an abstract class and cannot be instantiated

class Convertible < Car
  def door_count
    puts 2
  end
end

class Sedan < Car
  def door_count
    4
  end
end

Convertible.new .door_count